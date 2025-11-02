package ru.dkalchenko.structural.proxy;

import java.util.Objects;

public class ProxyProject implements Project {
    private String url;
    private Project realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (Objects.isNull(realProject)) {
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}

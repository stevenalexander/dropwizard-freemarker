package com.example.freemarker;

import com.example.freemarker.resources.UserResource;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;

public class FreemarkerService extends Service<FreemarkerConfiguration> {

    public static void main(String[] args) throws Exception
    {
        new FreemarkerService().run(args);
    }

    @Override
    public void initialize(Bootstrap<FreemarkerConfiguration> bootstrap) {
        bootstrap.setName("dropwizard-freemarker");
        bootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(FreemarkerConfiguration configuration,
                    Environment environment) {
        environment.addResource(new UserResource());
    }
}

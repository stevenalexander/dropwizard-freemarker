package com.example.freemarker;

import com.example.freemarker.resources.UserResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class FreemarkerApplication extends Application<FreemarkerConfiguration> {

    public static void main(String[] args) throws Exception
    {
        new FreemarkerApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-freemarker";
    }

    @Override
    public void initialize(Bootstrap<FreemarkerConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(FreemarkerConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(new UserResource());
    }
}

package com.example.freemarker.resources;

import com.example.freemarker.core.User;
import com.example.freemarker.views.UsersView;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/")
@Produces({MediaType.TEXT_HTML})
public class UserResource {

    public UserResource() {
        super();
    }

    @GET
    @Path("user")
    public UsersView fetch(){
        List<User> users = Arrays.asList(
                new User("user1", "pass1", "User 1", "Admin"),
                new User("user2", "pass2", "User 2", "DBA"));

        return new UsersView(users);
    }
}

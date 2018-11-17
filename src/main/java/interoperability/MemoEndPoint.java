package interoperability;

import business.Service;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path("/memo")
public class MemoEndPoint {

    @Inject
    private Service service;

    //### USERS ###

    @Path("/getUsersAll")
    @GET
    @Produces({"application/json"})
    public String getUsersAll(){ return service.getUsersAll(); }

    @Path("/getUsersNotes")
    @POST
    @Produces({"application/json"})
    public String getUsersNotes(Long userId) {
        return service.getUsersNotes(userId);
    }

    @Path("/addUser")
    @POST
    @Produces({"application/json"})
    public String addUser(String userJson){ return service.addUser(userJson);}

    @Path("/removeUser")
    @POST
    @Produces({"application/json"})
    public String removeUser(Long id){ return service.removeUser(id);}

    @Path("/updateUser")
    @POST
    @Produces({"application/json"})
    public String updateUser(String userJson){ return service.updateUser(userJson);}


    //### MEMOS ###

    @Path("/addNote")
    @POST
    @Produces({"application/json"})
    public String addNote(String memo) {
        return service.addNote(memo);
    }

    @Path("/removeNote")
    @POST
    @Produces({"application/json"})
    public String removeNote(Long id) {
        return service.removeNote(id);
    }

    @Path("/updateNote")
    @PUT
    @Produces({"application/json"})
    public String updateNote(String note) {
        return service.updateNote(note);
    }

}

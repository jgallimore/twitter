/**
 * Created by Tomitribe CXF WadlToJava code generator
**/
package com.twitter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import com.tomitribe.tribestream.governance.api.ApplicationLimit;
import com.tomitribe.tribestream.governance.api.Concurrent;
import com.tomitribe.tribestream.governance.api.GovernanceUnit;
import com.tomitribe.tribestream.governance.api.Rate;
import com.tomitribe.tribestream.governance.api.UserLimit;
import com.tomitribe.wadlx.api.ApiVersion;
import com.tomitribe.wadlx.api.Category;
import com.tomitribe.wadlx.api.Description;
import com.tomitribe.wadlx.api.See;
import com.tomitribe.wadlx.api.SeeAlso;
import com.tomitribe.wadlx.api.Tag;
import com.twitter.dev.api.UsersType;

@Path("/friendships")
public class FriendshipsResource {

    @GET
    @Produces("application/json")
    @Path("/incoming")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"follower management"})
    @See(href = "/docs/api/1.1/get/friendships/outgoing", value="GET friendships/outgoing")
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a collection of numeric IDs for every user who has a pending request to follow the authenticating user.")
    public Response getIncoming(@Description("Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filtered out after connections are queried. If no cursor is provided, a value of ")
     @QueryParam("cursor") final String cursor, @Description("Many programming environments will not consume our Tweet ids due to their size. Provide this option to have ids returned as strings instead. More about ")
     @QueryParam("stringify_ids") final Boolean stringify_ids) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/lookup")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"Bulk Operations","finding users","follower management"})
    @See(href = "/docs/api/1.1/get/users/lookup", value="GET users/lookup")
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns the relationships of the authenticating user to the comma-separated list of up to 100 screen_names or user_ids provided. Values for connections can be: following, following_requested, followed_by, none, blocking.")
    public Response getLookup(@Description("A comma separated list of screen names, up to 100 are allowed in a")
     @QueryParam("screen_name") final String screen_name, @Description("A comma separated list of user IDs, up to 100 are allowed in a single request.")
     @QueryParam("user_id") final String user_id) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/no_retweets/ids")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"Retweets"})
    @SeeAlso({@See(href = "/docs/api/1.1/post/friendships/update", value="POST friendships/update"),@See(href = "/docs/api/1.1/get/friendships/lookup", value="GET friendships/lookup"),@See(href = "/docs/api/1.1/get/user", value="GET user")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a collection of user_ids that the currently authenticated user does not want to receive retweets from. Use POST friendships/update to set the ")
    public UsersType getNo_retweetsids(@Description("Many programming environments will not consume our ids due to their size. Provide this option to have ids returned as strings instead. Read more about ")
     @QueryParam("stringify_ids") final Boolean stringify_ids) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/outgoing")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"follower management"})
    @See(href = "/docs/api/1.1/get/friendships/incoming", value="GET friendships/incoming")
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a collection of numeric IDs for every protected user for whom the authenticating user has a pending follow request.")
    public Response getOutgoing(@Description("Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filtered out after connections are queried. If no cursor is provided, a value of ")
     @QueryParam("cursor") final String cursor, @Description("Many programming environments will not consume our Tweet ids due to their size. Provide this option to have ids returned as strings instead. More about ")
     @QueryParam("stringify_ids") final Boolean stringify_ids) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/show")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"follower management"})
    @See(href = "/docs/api/1.1/get/friendships/lookup", value="GET friendships/lookup")
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@Description("Returns detailed information about the relationship between two arbitrary users.")
    public Response getShow(@Description("The user_id of the subject user.")
     @QueryParam("source_id") final Integer source_id, @Description("The screen_name of the subject user.")
     @QueryParam("source_screen_name") final String source_screen_name, @Description("The user_id of the target user.")
     @QueryParam("target_id") final Integer target_id, @Description("The screen_name of the target user.")
     @QueryParam("target_screen_name") final String target_screen_name) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/create")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"follower management","following"})
    @Description("Allows the authenticating users to follow the user specified in the ID parameter. Returns the befriended user in the requested format when successful. Returns a string describing the failure condition when unsuccessful.")
    public UsersType postCreate(@Description("The screen name of the user for whom to befriend. ")
     @QueryParam("screen_name") final String screen_name, @Description("The ID of the user for whom to befriend. ")
     @QueryParam("user_id") final Integer user_id, @Description("Enable notifications for the target user.")
     @QueryParam("follow") final Boolean follow) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/destroy")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"follower management","unfollowing"})
    @SeeAlso({@See(href = "/docs/api/1.1/post/friendships/create", value="POST friendships/create"),@See(href = "/docs/api/1.1/get/friendships/lookup", value="GET friendships/lookup")})
    @Description("Allows the authenticating user to unfollow the user specified in the ID parameter. Returns the unfollowed user in the requested format when successful. Returns a string describing the failure condition when unsuccessful. Actions taken in this method are asynchronous and changes will be eventually consistent.")
    public UsersType postDestroy(@Description("The screen name of the user for whom to unfollow. ")
     @QueryParam("screen_name") final String screen_name, @Description("The ID of the user for whom to unfollow. ")
     @QueryParam("user_id") final Integer user_id) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"notifications"})
    @Description("Allows one to enable or disable retweets and device notifications from the specified user.")
    public Response postUpdate(@Description("The screen name of the user for whom to befriend. ")
     @QueryParam("screen_name") final String screen_name, @Description("The ID of the user for whom to befriend. ")
     @QueryParam("user_id") final Integer user_id, @Description("Enable/disable device notifications from the target user.")
     @QueryParam("device") final String device, @Description("Enable/disable retweets from the target user.")
     @QueryParam("retweets") final String retweets) {
        //TODO: implement
        return null;
    }

}
/**
 * Created by Tomitribe CXF WadlToJava code generator
**/
package com.twitter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

@Path("/users")
public class UsersResource {

    @GET
    @Produces("application/json")
    @Path("/contributees")
    @Category({"users"})
    @ApiVersion({"1.1"})
    @Tag({"contributors"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/users/lookup", value="GET users/lookup"),@See(href = "/docs/api/1.1/get/users/contributors", value="GET users/contributors")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a collection of users that the specified user can &amp;quot;contribute&amp;quot; to.")
    public UsersType getContributees(@Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @QueryParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for.")
     @QueryParam("screen_name") final String screen_name, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
     @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/contributors")
    @Category({"users"})
    @ApiVersion({"1.1"})
    @Tag({"contributors"})
    @See(href = "/docs/api/1.1/get/users/contributees", value="GET users/contributees")
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a collection of users who can contribute to the specified account.")
    public UsersType getContributors(@Description("The ID of the user for whom to return results for.")
     @QueryParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for.")
     @QueryParam("screen_name") final String screen_name, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
     @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/lookup")
    @Category({"users"})
    @ApiVersion({"1.1"})
    @Tag({"Bulk Operations","finding users"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/users/search", value="GET users/search"),@See(href = "/docs/api/1.1/get/users/show", value="GET users/show")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 60))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@Description("Returns fully-hydrated user objects for up to 100 users per request, as specified by comma-separated values passed to the user_id and/or screen_name parameters.")
    public UsersType getLookup(@Description("A comma separated list of screen names, up to 100 are allowed in a single request. You are strongly encouraged to use a POST for larger (up to 100 screen names) requests.")
     @QueryParam("screen_name") final String screen_name, @Description("A comma separated list of user IDs, up to 100 are allowed in a single request. You are strongly encouraged to use a POST for larger requests.")
     @QueryParam("user_id") final String user_id, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node that may appear within embedded statuses will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/profile_banner")
    @Category({"users"})
    @ApiVersion({"1.1"})
    @Tag({"profile banner","profiles"})
    @SeeAlso({@See(href = "/docs/api/1.1/post/account/remove_profile_banner", value="POST account/remove_profile_banner"),@See(href = "/docs/api/1.1/post/account/update_profile_banner", value="POST account/update_profile_banner"),@See(href = "/docs/user-profile-images-and-banners", value="User Profile Images and Banners")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@Description("Returns a map of the available size variations of the specified user")
    public Response getProfile_banner(@Description("The ID of the user for whom to return results for. Helpful for disambiguating when a val")
     @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
     @QueryParam("screen_name") final String screen_name) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/search")
    @Category({"users"})
    @ApiVersion({"1.1"})
    @Tag({"Search","finding users"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/users/lookup", value="GET users/lookup"),@See(href = "/docs/api/1.1/get/users/show", value="GET users/show"),@See(href = "/docs/api/1.1/get/search/tweets", value="GET search/tweets")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@Description("Provides a simple, relevance-based search interface to public user accounts on Twitter. Try querying by topical interest, full name, company name, location, or other criteria. Exact match searches are not supported.")
    public UsersType getSearch(@Description("The search query to run against people search.")
     @PathParam("q") final String q, @Description("Specifies the page of results to retrieve.")
     @QueryParam("page") final Integer page, @Description("The number of potential user results to retrieve per page. This value has a maximum of 20.")
     @QueryParam("count") final Integer count, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded from embedded tweet objects when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/show")
    @Category({"users"})
    @ApiVersion({"1.1"})
    @Tag({"finding users"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/friends/ids", value="GET friends/ids"),@See(href = "/docs/api/1.1/get/followers/ids", value="GET followers/ids"),@See(href = "/docs/api/1.1/get/users/lookup", value="GET users/lookup"),@See(href = "/docs/api/1.1/get/users/search", value="GET users/search"),@See(href = "/docs/user-profile-images-and-banners", value="User Profile Images and Banners")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@Description("Returns a variety of information about the user specified by the required user_id or screen_name parameter. The author")
    public UsersType getShow(@Description("The ID of the user for whom to return results for. Either an id or screen_name is required for this method.")
     @PathParam("user_id") final int user_id, @Description("The screen name of the user for whom to return results for. Either a id or screen_name is required for this method.")
     @PathParam("screen_name") final String screen_name, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/suggestions")
    @Category({"users"})
    @ApiVersion({"1.1"})
    @Tag({"finding users"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/users/suggestions/%3Aslug", value="GET users/suggestions/:slug"),@See(href = "/docs/api/1.1/get/users/suggestions/%3Aslug/members", value="GET users/suggestions/:slug/members")})
    @Description("Access to Twitter&amp;#039;s suggested user list. This returns the list of suggested user categories. The category can be used in GET users/suggestions/:slug to get the users in that category.")
    public Response getSuggestions(@Description("Restricts the suggested categories to the requested language. The language must be specified by the appropriate two letter ISO 639-1 representation. Currently supported languages are provided by the ")
     @QueryParam("lang") final String lang) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/suggestions/{slug}")
    @Category({"users"})
    @ApiVersion({"1.1"})
    @Tag({"finding users"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/users/suggestions", value="GET users/suggestions"),@See(href = "/docs/api/1.1/get/users/suggestions/%3Aslug", value="GET users/suggestions/:slug")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Access the users in a given category of the Twitter suggested user list. It is recommended that applications cache this data for no more than one hour.")
    public Response getSuggestionsslug(@Description("The short name of list or a category")
     @PathParam("slug") final String slug, @Description("Restricts the suggested categories to the requested language. The language must be specified by the appropriate two letter ISO 639-1 representation. Currently supported languages are provided by the ")
     @QueryParam("lang") final String lang) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/suggestions/{slug}/members")
    @Category({"users"})
    @ApiVersion({"1.1"})
    @Tag({"finding users"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/users/suggestions/%3Aslug", value="GET users/suggestions/:slug"),@See(href = "/docs/api/1.1/get/users/suggestions", value="GET users/suggestions")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Access the users in a given category of the Twitter suggested user list and return their most recent status if they are not a protected user.")
    public UsersType getSuggestionsslugmembers(@Description("The short name of list or a category")
     @PathParam("slug") final String slug) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/report_spam")
    @Category({"users"})
    @ApiVersion({"1.1"})
    @See(href = "/docs/support", value="Support")
    @Description("Report the specified user as a spam account to Twitter. Additionally performs the equivalent of POST blocks/create on behalf of the authenticated user.")
    public UsersType postReport_spam(@Description("The ID or screen_name of the user you want to report as a spammer. Helpful for disambiguating when a valid screen name is also a user ID.")
     @QueryParam("screen_name") final String screen_name, @Description("The ID of the user you want to report as a spammer. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @QueryParam("user_id") final Integer user_id) {
        //TODO: implement
        return null;
    }

}
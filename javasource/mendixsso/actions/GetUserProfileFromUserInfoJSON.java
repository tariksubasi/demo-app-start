// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mendixsso.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import mendixsso.implementation.utils.UserProfileUtils;
import mendixsso.proxies.UserProfile;

public class GetUserProfileFromUserInfoJSON extends CustomJavaAction<IMendixObject>
{
	private java.lang.String userInfoJSON;

	public GetUserProfileFromUserInfoJSON(IContext context, java.lang.String userInfoJSON)
	{
		super(context);
		this.userInfoJSON = userInfoJSON;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
        final UserProfile userProfile = UserProfileUtils.getUserProfile(getContext(), userInfoJSON);
        if (userProfile == null) {
            return null;
        }
        return userProfile.getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetUserProfileFromUserInfoJSON";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

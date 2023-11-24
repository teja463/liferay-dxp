package user.service.wrapper;

import com.liferay.portal.kernel.service.UserLocalServiceWrapper;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author bponnuru
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class UserServiceWrapper extends UserLocalServiceWrapper {

	@Reference
	private volatile UserLocalService _userLocalService;
	
	private static final Log log = LogFactoryUtil.getLog(UserLocalService.class);
	
	public UserServiceWrapper() {
		super(null);
	}
	
	@Override
	public User getUser(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		User user = _userLocalService.getUserById(userId);
		if(user !=null) {
			System.out.println("user " + user.getEmailAddress());
		}
		return user;
	}
	

}
package training.tracker.rest.internal.resource.v1_0;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.vulcan.pagination.Page;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import training.tracker.rest.dto.v1_0.MyUser;
import training.tracker.rest.resource.v1_0.MyUsersResource;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bponnuru
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/my-users.properties",
	scope = ServiceScope.PROTOTYPE, service = MyUsersResource.class
)
public class MyUsersResourceImpl extends BaseMyUsersResourceImpl {

	@Reference
	private volatile UserLocalService _userLocalService;

	@Override
	public Page<MyUser> getAllUsers() throws Exception {
		List<User> users = _userLocalService.getUsers(0, 10);
		List<MyUser> myUsers = users.stream().map(user -> {
			MyUser myUser = new MyUser();
			myUser.setEmail(user.getEmailAddress());
			myUser.setFirstName(user.getFirstName());
			myUser.setLastName(user.getLastName());
			myUser.setEmail(user.getEmailAddress());
			return myUser;
		}).collect(Collectors.toList());
		return Page.of(myUsers);
	}
}
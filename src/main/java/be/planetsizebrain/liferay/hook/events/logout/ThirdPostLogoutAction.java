package be.planetsizebrain.liferay.hook.events.logout;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"key=logout.events.post",
				"service.ranking:Integer=100"
		},
		service = LifecycleAction.class
)
public class ThirdPostLogoutAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		System.out.println("Third post logout action");
	}
}
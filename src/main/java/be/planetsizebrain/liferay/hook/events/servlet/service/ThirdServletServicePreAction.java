package be.planetsizebrain.liferay.hook.events.servlet.service;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"key=servlet.service.events.pre",
				"service.ranking:Integer=100"
		},
		service = LifecycleAction.class
)
public class ThirdServletServicePreAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		System.out.println("Third servlet service pre action");
	}
}
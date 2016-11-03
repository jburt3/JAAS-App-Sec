import java.security.Principal;

/**
 * @author joey
 * We have created a custom principal class to store each principal.
 */
public class JPrincipal implements Principal {
	String name;
	
	JPrincipal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

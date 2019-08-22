package util;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class FacesContextUtil {
	
	private static FacesContextUtil instance;
	
	public static FacesContextUtil getInstance() {
		if(instance ==  null) {
			return new FacesContextUtil();
		}
		
		return instance;
	}

	public ExternalContext getExternalContext() {
		return FacesContext.getCurrentInstance().getExternalContext();
	}
}

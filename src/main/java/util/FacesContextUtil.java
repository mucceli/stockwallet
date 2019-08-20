package util;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class FacesContextUtil {

	public ExternalContext getExternalContext() {
		return FacesContext.getCurrentInstance().getExternalContext();
	}
}

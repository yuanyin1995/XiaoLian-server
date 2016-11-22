package top.aiome.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseLoginUser<M extends BaseLoginUser<M>> extends Model<M> implements IBean {

	public void setLoginUserId(java.lang.Integer loginUserId) {
		set("loginUserId", loginUserId);
	}

	public java.lang.Integer getLoginUserId() {
		return get("loginUserId");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}

	public java.lang.String getMobile() {
		return get("mobile");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return get("password");
	}

}

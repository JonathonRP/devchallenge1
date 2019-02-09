package com.wexinc.interview.challenge1.models;

public class ChangePasswordRequest {
	private String currentPassword;
    private String newPassword;
    private String verifyPassword;

	public ChangePasswordRequest(String currentPassword, String newPassword, String verifyPassword) {
		super();
		this.currentPassword = currentPassword;
		this.newPassword = newPassword;
		this.verifyPassword = verifyPassword;
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
    
    public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

}
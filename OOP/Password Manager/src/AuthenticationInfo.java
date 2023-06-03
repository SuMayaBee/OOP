public class AuthenticationInfo {
    private String website_URL;
    private String username;
    private String password;

    public AuthenticationInfo(String website_URL, String username, String password) {
        this.website_URL = website_URL;
        this.username = username;
        this.password = password;
    }

    public String getWebsite_URL() {
        return website_URL;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public void setWebsite_URL(String website_URL) {
        this.website_URL = website_URL;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

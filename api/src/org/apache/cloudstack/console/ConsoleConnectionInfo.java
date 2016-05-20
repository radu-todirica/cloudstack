package org.apache.cloudstack.console;


public class ConsoleConnectionInfo {
    private String displayName;
    private String clientHostAddress;
    private int clientHostPort;
    private String clientHostPassword;
    private String locale;
    private String clientTunnelUrl;
    private String clientTunnelSession;

    private String hypervHost;

    private String username;
    private String password;

    public String getClientHostAddress() {
        return clientHostAddress;
    }


    public void setClientHostAddress(String clientHostAddress) {
        this.clientHostAddress = clientHostAddress;
    }


    public Integer getClientHostPort() {
        return clientHostPort;
    }


    public void setClientHostPort(Integer clientHostPort) {
        this.clientHostPort = clientHostPort;
    }


    public String getClientHostPassword() {
        return clientHostPassword;
    }


    public void setClientHostPassword(String clientHostPassword) {
        this.clientHostPassword = clientHostPassword;
    }


    public String getLocale() {
        return locale;
    }


    public void setLocale(String locale) {
        this.locale = locale;
    }


    public String getClientTunnelUrl() {
        return clientTunnelUrl;
    }


    public void setClientTunnelUrl(String clientTunnelUrl) {
        this.clientTunnelUrl = clientTunnelUrl;
    }


    public String getClientTunnelSession() {
        return clientTunnelSession;
    }


    public void setClientTunnelSession(String clientTunnelSession) {
        this.clientTunnelSession = clientTunnelSession;
    }


    public String getHypervHost() {
        return hypervHost;
    }


    public void setHypervHost(String hypervHost) {
        this.hypervHost = hypervHost;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public void setClientHostPort(int clientHostPort) {
        this.clientHostPort = clientHostPort;
    }


    public String getDisplayName() {
        return displayName;
    }


    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }




}

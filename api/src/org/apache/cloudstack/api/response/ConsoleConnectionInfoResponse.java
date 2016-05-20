package org.apache.cloudstack.api.response;

import org.apache.cloudstack.api.BaseResponse;
import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;
import org.apache.cloudstack.console.ConsoleConnectionInfo;

import org.apache.cloudstack.api.ApiConstants;

public class ConsoleConnectionInfoResponse extends BaseResponse {

    @SerializedName(ApiConstants.CLIENTHOSTADDRESS)
    @Param(description = "Client Host Address for VNC connection")
    private String clientHostAddress;

    @SerializedName(ApiConstants.CLIENTHOSTPORT)
    @Param(description = "Client Host PORT for VNC connection")
    private Integer clientHostPort;

    @SerializedName(ApiConstants.CLIENTHOSTPASSSWORD)
    @Param(description = "Client host password for VNC connection")
    private String clientHostPassword;

    @SerializedName(ApiConstants.LOCALE)
    @Param(description = "Client locale")
    private String locale;

    @SerializedName(ApiConstants.HYPERV_HOST)
    @Param(description = "HyperV host")
    private String hypervHost;

    @SerializedName(ApiConstants.USERNAME)
    @Param(description = "HyperV username")
    private String username;

    @SerializedName(ApiConstants.PASSWORD)
    @Param(description = "HyperV password")
    private String password;

    @SerializedName(ApiConstants.DISPLAY_NAME)
    @Param(description = "VM Display Name")
    private String displayName;

    public ConsoleConnectionInfoResponse(ConsoleConnectionInfo cci) {
        setClientHostAddress(cci.getClientHostAddress());
        setClientHostPort(cci.getClientHostPort());
        setClientHostPassword(cci.getClientHostPassword());
        setLocale(cci.getLocale());
        setHypervHost(cci.getHypervHost());
        setUsername(cci.getUsername());
        setPassword(cci.getPassword());
        setDisplayName(cci.getDisplayName());
    }

    public String getClientHostAddress() {
        return clientHostAddress;
    }

    public void setClientHostAddress(String clientHostAddress) {
        this.clientHostAddress = clientHostAddress;
    }

    public int getClientHostPort() {
        return clientHostPort;
    }

    public void setClientHostPort(int clientHostPort) {
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

    public void setClientHostPort(Integer clientHostPort) {
        this.clientHostPort = clientHostPort;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}

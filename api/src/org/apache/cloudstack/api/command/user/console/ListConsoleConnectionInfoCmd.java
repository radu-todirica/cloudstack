package org.apache.cloudstack.api.command.user.console;

import org.apache.cloudstack.api.BaseCmd;
import org.apache.cloudstack.api.Parameter;
import org.apache.cloudstack.api.ServerApiException;
import org.apache.cloudstack.api.command.admin.config.ListCfgsByCmd;
import org.apache.log4j.Logger;

import com.cloud.exception.ConcurrentOperationException;
import com.cloud.exception.InsufficientCapacityException;
import com.cloud.exception.NetworkRuleConflictException;
import com.cloud.exception.ResourceAllocationException;
import com.cloud.exception.ResourceUnavailableException;
import org.apache.cloudstack.api.APICommand;
import org.apache.cloudstack.api.ApiConstants;
import org.apache.cloudstack.api.response.ConsoleConnectionInfoResponse;
import org.apache.cloudstack.console.ConsoleConnectionInfo;

@APICommand(name="ListConsoleConnectionInfo", description="Lists connection information for a given virtual machine", responseObject=ConsoleConnectionInfoResponse.class,
    requestHasSensitiveInfo = false, responseHasSensitiveInfo = false)
public class ListConsoleConnectionInfoCmd extends BaseCmd {

    public static final Logger s_logger = Logger.getLogger(ListCfgsByCmd.class.getName());

    private static final String s_name = "consoleconnectioninforesponse";



    @Parameter(name = ApiConstants.VIRTUAL_MACHINE_ID, type = CommandType.UUID, description = "Virtual Machine ID to connect to", required = true)
    private Long virtualmachineid;

    @Override
    public void execute() throws ResourceUnavailableException, InsufficientCapacityException, ServerApiException, ConcurrentOperationException, ResourceAllocationException,
            NetworkRuleConflictException {
        ConsoleConnectionInfo cci = _mgr.getConsoleConnectionInfo(this);
        ConsoleConnectionInfoResponse resp = new ConsoleConnectionInfoResponse(cci);
        setResponseObject(resp);
    }

    @Override
    public String getCommandName() {
        return s_name;
    }

    @Override
    public long getEntityOwnerId() {
        // This desn't make sense here
        return 0;
    }

    public Long getVirtualMachineId() {
        return virtualmachineid;
    }



}

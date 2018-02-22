/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.xpdl;
import traductorxpdlxml.xpdl.PackageHeader;
import traductorxpdlxml.xpdl.Pools;
import traductorxpdlxml.xpdl.WorkflowProcesses;
/**
 *
 * @author PC01
 */
public class Package {
    protected PackageHeader packageHeader;

    public PackageHeader getPackageHeader() {
        return packageHeader;
    }

    public void setPackageHeader(PackageHeader packageHeader) {
        this.packageHeader = packageHeader;
    }

    public Pools getPools() {
        return pools;
    }

    public void setPools(Pools pools) {
        this.pools = pools;
    }

    public WorkflowProcesses getWorkflowProcesses() {
        return workflowProcesses;
    }

    public void setWorkflowProcesses(WorkflowProcesses workflowProcesses) {
        this.workflowProcesses = workflowProcesses;
    }
    protected Pools pools;
    protected WorkflowProcesses workflowProcesses;
}

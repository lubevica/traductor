/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.xpdl;
import traductorxpdlxml.xpdl.ProcessType;
import traductorxpdlxml.xpdl.Activities;
import traductorxpdlxml.xpdl.Transitions;
/**
 *
 * @author PC01
 */
class WorkflowProcess {
    protected ProcessType workflowProcess;
    protected Activities activities;
    protected Transitions transitions;

    public ProcessType getWorkflowProcess() {
        return workflowProcess;
    }

    public void setWorkflowProcess(ProcessType workflowProcess) {
        this.workflowProcess = workflowProcess;
    }

    public Activities getActivities() {
        return activities;
    }

    public void setActivities(Activities activities) {
        this.activities = activities;
    }

    public Transitions getTransitions() {
        return transitions;
    }

    public void setTransitions(Transitions transitions) {
        this.transitions = transitions;
    }
}

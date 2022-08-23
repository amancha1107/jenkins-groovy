// goto jenkins ---  new-item
// - install active choice plugin
// - select active choice 
// - select groovy scripting and paste the below code

// - CD-JENKINS-ANSIBLE
// - select "this project is parameterized option"
// - select "Add parameter" -- "Active Choices Parameter"
//     Name: NEXUS
// - select "groovy script"
// - copy the below groovy script and place in "groovy script" option


def sout = new StringBuffer(), serr = new StringBuffer()
def proc ='/opt/nexus.sh'.execute()
proc.consumeProcessOutput(sout, serr)
proc.waitForOrKill(1000)
return sout.tokenize()

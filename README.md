Hello world project for devploy proxies to Apigee Edge.

The proxy in apigee is: <b>pipelinedevtest</b>(for this in <b>dev</b> there is a product <b>pipelinedevtest-product</b> and an app <b>pipelinedevtest-app</b>)

The jenkins job is hosted in: https://jenkins.allstate.com/job/pipelinedevtest/

It uses Apigee Deploy Maven Plugin.
For more information see:
<ol>
<li>https://github.com/dzuluagaapigee/apigee-ci-jenkins-git-maven-jmeter</li>
<li>https://github.com/apigee/apigee-deploy-maven-plugin</li>
</ol>
For the setup in Jenkins enterprise see: https://jenkins.allstate.com/job/jenkins-apigee-template/

Others settings in the github repository(see https://code1440.allstate.com/?media_dl=1590):
<ol>
<li>Add SYS-ISJenkins as collaborator for the github project</li>
<li>Create a webhook from the github project to jenkins enterprise(with the secret to connect to Jenkins enterprise).</li>
</ol>

Note this uses Jenkins pipeline plugin with a <b>Jenkinsfile.groovy</b> 
file hosted in github(Jenkinsfile.groovy)

With this configuration:
<ol>
<li>At every commit a new revision is deployed to Apigee Edge in <b>arity-ccp-nonprod</b> in the <b>dev</b> environment.</li>
<li>If in the commit message includes a <b>ServiceNow change record</b> for the promotion in <b>arity-ccp</b> then:
    <ol>
      <li>An email is sent to DevExRockstars@allstate.com with the commit message(eg. Please deploy the approved change record CHG12345678)</li>
      <li>The Jenkins job "hangs" in the pipeline waiting for the manual approval to be deployed to <b>arity-ccp</b> in the  <b>staging</b> environment.(NB. Jenkins asks for email and password to deploy in <b>arity-ccp</b>))</li>
    </ol>
</li>
</ol>

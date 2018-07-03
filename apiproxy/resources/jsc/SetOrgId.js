var developerId = context.getVariable('developer.id');

if (developerId === null || developerId === '') {
    context.setVariable("flow.error.status", "400");
    context.setVariable("flow.error.reason", "Bad Request");
    context.setVariable("flow.error.message", "Header Information Missing");
    throw new Error();
    
} else {
    var orgId = context.getVariable('developer.id').split("@@@")[1];
    
    if (orgId === null || orgId === '') {
    context.setVariable("flow.error.status", "400");
    context.setVariable("flow.error.reason", "Bad Request");
    context.setVariable("flow.error.message", "Header Information Missing");
    throw new Error();
    
    } else {
        context.setVariable('flow.request.orgId', orgId); 
    }
}
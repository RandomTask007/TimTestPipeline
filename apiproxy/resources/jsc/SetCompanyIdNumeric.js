//this only works when a product has a company assigned. if no company then this fails. 

var companyId = context.getVariable('company.orgcode');

if (companyId === null || companyId === '') {
    context.setVariable("flow.error.status", "400");
    context.setVariable("flow.error.reason", "Bad Request");
    context.setVariable("flow.error.message", "Header Information Missing");
    throw new Error();
    
} else {
    var companyId = context.getVariable('company.orgcode').split("@@@")[1];
    
    if (companyId === null || companyId === '') {
    context.setVariable("flow.error.status", "400");
    context.setVariable("flow.error.reason", "Bad Request");
    context.setVariable("flow.error.message", "Header Information Missing");
    throw new Error();
    
    } else {
        context.setVariable('flow.request.companyId', companyId); 
    }
}
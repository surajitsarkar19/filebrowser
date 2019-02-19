/**
 * 
 * @param path
 * @param params
 * @param method
 * @returns
 */

function post(path, params, method) {
	method = method || "post"; 

	var form = document.createElement("form");
	form.setAttribute("method", method);
	form.setAttribute("action", path);

	for ( var key in params) {
		if (params.hasOwnProperty(key)) {
			var hiddenField = document.createElement("input");
			hiddenField.setAttribute("type", "hidden");
			hiddenField.setAttribute("name", key);
			hiddenField.setAttribute("value", params[key]);

			form.appendChild(hiddenField);
		}
	}

	document.body.appendChild(form);
	form.submit();
}

/**
 * Exports the given object into the global context.
 */
var exportGlobal = function(name, object) {
    if (typeof(global) !== "undefined")  {
        // Node.js
        global[name] = object;
    }
    else if (typeof(window) !== "undefined") {
        // JS with GUI (usually browser)
        window[name] = object;
    }
    else {
        throw new Error("Unkown run-time environment. Currently only browsers and Node.js are supported.");
    }
};


// export exportGlobal itself
exportGlobal("exportGlobal", exportGlobal);


function postAjax(path, param, method){
	method = method || "post";
}

function redirect(path){
	window.location.assign(path)
}

function showAlert(){
	alert("hii")
}
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/login.feature");
formatter.feature({
  "name": "prueba de login",
  "description": "  yo como usuario de SDETrainning\n  Quiero que cuando ingrese a la pagina de login\n  Me pueda logear",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "el usuario se no puede logear con credenciales invalidas",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "el usuario esta en la pagina de login",
  "keyword": "Given "
});
formatter.step({
  "name": "el usuario ingresa credenciales invalidas \"\u003cemail\u003e\" y el password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "el usuario puede ver un mensaje de error \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "message"
      ]
    },
    {
      "cells": [
        "didier@unac.edu.co",
        "didier2",
        "Invalid password, try again!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "el usuario se no puede logear con credenciales invalidas",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "el usuario esta en la pagina de login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.el_usuario_esta_en_la_pagina_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ingresa credenciales invalidas \"didier@unac.edu.co\" y el password \"didier2\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.el_usuario_ingresa_credenciales_invalidas_y_el_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario puede ver un mensaje de error \"Invalid password, try again!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.el_usuario_puede_ver_un_mensaje_de_error(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "el usuario se puede logear con credenciales validas",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "el usuario esta en la pagina de login",
  "keyword": "Given "
});
formatter.step({
  "name": "el usuario ingresa credenciales validas \"\u003cemail\u003e\" y el password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "el usuario puede ver su panel de administracion \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "message"
      ]
    },
    {
      "cells": [
        "didier@unac.edu.co",
        "didier",
        "Logged in successfully"
      ]
    }
  ]
});
formatter.scenario({
  "name": "el usuario se puede logear con credenciales validas",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "el usuario esta en la pagina de login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.el_usuario_esta_en_la_pagina_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ingresa credenciales validas \"didier@unac.edu.co\" y el password \"didier\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.el_usuario_ingresa_credenciales_validas_y_el_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario puede ver su panel de administracion \"Logged in successfully\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.el_usuario_puede_ver_su_panel_de_administracion(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("featureFiles/register.feature");
formatter.feature({
  "name": "prueba de registro",
  "description": "\tyo como usuario de SDETrainning\n  Quiero cuando ingrese a la pagina de registro\n  Me pueda registrar",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "el usuario se puede logear con credenciales validas",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "el usuario esta en la pagina de registro",
  "keyword": "Given "
});
formatter.step({
  "name": "el usuario ingresa sus datos \"\u003cname\u003e\" \"\u003cemail\u003e\" \"\u003cphone\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "el usuario puede ver un mensaje de exito al registrarse",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "email",
        "phone",
        "password"
      ]
    },
    {
      "cells": [
        "Edwin Méndez",
        "edwin01@unac.edu.co",
        "123456789",
        "calidad123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "el usuario se puede logear con credenciales validas",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "el usuario esta en la pagina de registro",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterStep.el_usuario_esta_en_la_pagina_de_registro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ingresa sus datos \"Edwin Méndez\" \"edwin01@unac.edu.co\" \"123456789\" \"calidad123\"",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterStep.el_usuario_ingresa_sus_datos(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario puede ver un mensaje de exito al registrarse",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
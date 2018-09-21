Feature: prueba de login
yo como usuario de SDETrainning
Quiero que cuando ingrese a la pagina de login
Me pueda logear

Scenario: el usuario se puede logear con credenciales validas
Given el usuario esta en la pagina de login
When el usuario ingresa credenciales validas
Then el usuario puede ver su panel de administración

Scenario: el usuario se puede logear con credenciales incorrectas
Given el usuario esta en la pagina de login
When el usuario ingresa credenciales incorrectas
Then el usuario puede der un mensaje de error.
Feature: prueba de registro 
	yo como usuario de SDETrainning
  Quiero cuando ingrese a la pagina de registro
  Me pueda registrar

Scenario Outline: el usuario se puede logear con credenciales validas 
	Given el usuario esta en la pagina de registro 
	When el usuario ingresa sus datos "<name>" "<email>" "<phone>" "<password>"
	Then el usuario puede ver un mensaje de exito al registrarse 
	
	Examples: 
		| name         | email 				   | phone     | password   |
		| Edwin Méndez | edwin01@unac.edu.co   | 123456789 | calidad123 | 
      
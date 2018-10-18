Feature: prueba de login
  yo como usuario de SDETrainning
  Quiero que cuando ingrese a la pagina de login
  Me pueda logear

  Scenario Outline: el usuario se no puede logear con credenciales invalidas
    Given el usuario esta en la pagina de login
    When el usuario ingresa credenciales invalidas "<email>" y el password "<password>"
    Then el usuario puede ver un mensaje de error "<message>"

    Examples: 
      | email              | password | message                      |
      | didier@unac.edu.co | didier2  | Invalid password, try again! |

  Scenario Outline: el usuario se puede logear con credenciales validas
    Given el usuario esta en la pagina de login
    When el usuario ingresa credenciales validas "<email>" 
    And y el password "<password>"
    Then el usuario puede ver su panel de administracion "<message>"
      
    Examples: 
      | email              | password | message                      |
      | didier@unac.edu.co | didier   | Logged in successfully       |
      
# Envio de email

##  Envio de email básico utilizando a lib javaMail e o smtp do google

### Config
O projeto uliza o maven, é necessário executar o build inicial para baixar a lib javaMail version 1.5.5

1 - Abra a classe App e configure suas credênciais - email e senha
2 - Verifique se sua conta está habilitado para terceiros executarem o envio de email.

vá em https://myaccount.google.com/ -> segurança -> Acesso a app menos seguro , ative está função.

3 - Na classe SendEmail - coloque o email do destinatário.

### Exec
Execute a classe SendEmail


### Result 
retorno no console e verifique seu email.

### Observações
É possível colocar no email destinatário e email remetente seu próprio email para testar, o google libera esse tipo de teste.

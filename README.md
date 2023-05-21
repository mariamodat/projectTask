# CoderzTask
This app will allow you to create CoderzUser with input {"id": , "username": } if the user is Authorized to create 
otherwize 401 response will be returned. 

# curls to be used 
**note that you need to change the username and password based on your application configuration 
1. **to generate JWT token: 

curl --location --request POST 'http://localhost:8090/api/auth' \
--header 'username: username' \
--header 'password: password' \
--header 'Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ=' \
--header 'Cookie: JSESSIONID=8D5C2F7198D9E7FB402641F65A9D2B4E'

2. **to create new user: 


curl --location 'http://0.0.0.0:8090' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VybmFtZSIsImlhdCI6MTY4NDY4MzA3MSwiZXhwIjoxNjg0NjgzMTAxfQ.kZx9AY01HlWD2l3Y8Ne7eahTy5DLNQlvc7vP49wRSrhx-2ntKgDuL4KIPx_5kQE_UbN_LX5qYlWjbSOCDw6RkQ' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=0E38EA27E3409473BCA27595D60B9833' \
--data '{
    "id": 2,
    "username" : "mariam2"
}'

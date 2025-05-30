{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 # Mutual Fund Order API\
\
This is a Spring Boot REST API that allows users to create, view, and delete mutual fund orders. It uses an in-memory H2 database for quick testing and development.\
\
## \uc0\u55357 \u56960  Technologies Used\
- Java 17+\
- Spring Boot\
- Spring Data JPA\
- H2 Database\
- Maven\
- Postman (for API testing)\
\
## \uc0\u55357 \u56550  Features\
- `GET /api/orders` - List all orders\
- `POST /api/orders` - Create a new order\
- `DELETE /api/orders/\{id\}` - Delete order by ID\
- Access H2 Console at `/h2-console`\
\
## \uc0\u55358 \u56810  How to Test\
Use Postman to test the APIs:\
1. Start the Spring Boot app\
2. Test endpoints like:\
   - `GET http://localhost:8080/api/orders`\
   - `POST http://localhost:8080/api/orders`\
   - `DELETE http://localhost:8080/api/orders/1`\
3. Access H2 Console at:\
   - `http://localhost:8080/h2-console`\
   - JDBC URL: `jdbc:h2:mem:testdb`\
\
## \uc0\u55357 \u57056  Setup Instructions\
```bash\
git clone https://github.com/Andrew22122001/mutual-fund-api.git\
cd mutual-fund-api\
./mvnw spring-boot:run\
}
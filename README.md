﻿﻿ # ﻿﻿﻿﻿﻿﻿﻿﻿﻿SetupDownload this project and open in Eclipse editor as Maven project# Set CredentialsLocate the file at location /src/main/resourses/application.yaml```spring.datasource.url: jdbc:h2:file:./camunda-h2-databasecamunda.bpm.admin-user:  id: admin  password: admin```# Workflow![Workflow Image](/screenshots/order.png)# Run Application![Run Image](/screenshots/run.png)![Start Image](/screenshots/start.png)**username:** admin**password:** admin![Login Image](/screenshots/open_login.png)Open task app from camunda dashboard![Start Image](/screenshots/start_process.png)Fill the variables![Var Image](/screenshots/start_variable.png)Check log in eclipse console after starting process![Log Image](/screenshots/workflow_log.png)# PostmanPlease find the postman collection in json format, import the file in postman and run request
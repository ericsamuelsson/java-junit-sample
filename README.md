This project demonstrates how to use Build and Deploy to build a Java
application with unit tests.

The build stage has an environment property named APP_VERSION that should
be set to the version of the application. The variable is used during the
build to generate a file with the version number.

If the environment property is not set the unit tests will fail.

Once set the version number file is included in the war file and there's
an API on the deployed application to check the version:

    <app-url>/api/version
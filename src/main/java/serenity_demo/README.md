# Application Code

Test code should be versioned with the application code under test.

In the case of a micro-service architecture that means end-to-end type black-box tests should be versioned with the deploy script which determines the micro-service versions. If there is no overall version for the collection of micro-services then there is a problem in that the "service" as a whole is unversioned making repeatable testing of emergent system behaviour difficult if not impossible.   
help:
	echo "Build tool for Cloud Native Miroservice"

init:
	gradle wrapper

compile:
	./gradlew :classes --warning-mode all

unit-test:
	./gradlew :check --warning-mode all

utest: unit-test

integration-test:
	./gradlew :check --warning-mode all

itest: integration-test

build-java:
	./gradlew :build --warning-mode all

build: build-java

run:
	./gradlew :bootRun --args='--spring.profiles.active=dev' --warning-mode all

clean:
	./gradlew :clean --warning-mode all
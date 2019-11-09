set -e

mvn compile jib:dockerBuild

docker-compose up -d
timeout 30 bash -c 'while [[ "$(curl -s -o /dev/null -w ''%{http_code}'' localhost:8080/actuator/health)" != "200" ]]; do sleep 5; done' || false

curl http://localhost:8080/users

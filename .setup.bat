@echo off
set modulus=YOUR_MODULUS_KEY
./gradlew patch --args="-version=226.1 -type=win -javconfig=https://cdn.rsprox.net/javconfig_local_226.ws -worldlist=https://cdn.rsprox.net/example_worldlist.ws -varpcount=15000 -siteurl=rsprox.net -name=RSProx -modulus=%modulus%"

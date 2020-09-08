(defproject financeiro "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-core "1.8.1"]
                 [ring/ring-jetty-adapter "1.8.1"]
                 [ring/ring-json "0.5.0"]
                 [clj-http "3.10.1"]
                 [cheshire "5.10.0"]
                 [javax.servlet/servlet-api "2.5"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler financeiro.handler/app}
  :profiles
  {:dev {:dependencies [[ring/ring-mock "0.3.2"]
                        [midje "1.9.9"]]                        
         :plugins [[lein-midje "3.2.1"]
                   [lein-cloverage "1.2.0"]]}}
  :test-paths ["test/unitarios" "test/aceitacao"]
  :uberjar-name "financeiro.jar")

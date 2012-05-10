(defproject pallet-thread "0.1.0"
  :description "Library to simplify Java thread usage"
  :url "https://github.com/pallet/thread"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :warn-on-reflection true
  :dependencies [[org.clojure/clojure "1.2.1"]]
  :profiles {:dev {:dependencies [[codox-md "0.1.0"]
                                  [codox/codox.core "0.6.1"]]}}
  :codox {:writer codox-md.writer/write-docs
          :output-dir "doc/0.1"})

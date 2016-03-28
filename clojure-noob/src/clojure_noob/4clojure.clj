(ns clojure-noob.4clojure)

(defn testtest
  [[h & r]]
  ((if (empty? r)
     h
     (testtest r))))
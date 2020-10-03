(ns ^:figwheel-hooks hello-world.app
  (:require [axios]
            [reagent.dom :as dom]))


(defn app
  []
  [:h1 "Hello, there, yo"])


(defn render-app
  []
  (dom/render [app] (js/document.getElementById "hello_world_container")))


(defn ^:after-load re-render
  []
  (render-app))


(defonce init-app (do (render-app) true))

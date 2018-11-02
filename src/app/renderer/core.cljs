(ns app.renderer.core
  (:require [reagent.core :as reagent :refer [atom]]
            [app.renderer.components.header :refer [header]]))

(defn root-component []
  [:div {:className "appContainer"}
    [header]
  ])

(defn start! []
  (reagent/render
    [root-component]
    (js/document.getElementById "app")))

(start!)


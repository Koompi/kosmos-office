(ns app.renderer.components.insertTab)

(defn insertTab
  []
  [:div {:className "ribbonMainGroup"}
      [:ul
        [:li {:data "Undo" :className "ribbonIcon" :style {:backgroundImage "url('img/undo.png')"}}]]])

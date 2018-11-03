(ns app.renderer.components.layoutTab)

(defn layoutTab
  []
  [:div {:className "ribbonMainGroup"}
   [:ul
    [:li {:data "Break Page" :className "ribbonIconwithText" :style {:backgroundImage "url('img/margin.png')"}} "Margin"]
    [:li {:data "Create Table" :className "ribbonIconwithText" :style {:backgroundImage "url('img/pageOrientation.png')"}} "Orientation"]
    [:li {:data "Insert Picture" :className "ribbonIconwithText" :style {:backgroundImage "url('img/picture.png')"}} "Size"]
    [:li {:data "Insert Link" :className "ribbonIconwithText" :style {:backgroundImage "url('img/indentLeft.png')"}} "Indent Left"]
    [:li {:data "Give Comments" :className "ribbonIconwithText" :style {:backgroundImage "url('img/indentRight.png')"}} "Indent Right"]
    [:li {:data "Header & Footer" :className "ribbonIconwithText" :style {:backgroundImage "url('img/indentLeft.png')"}} "Spacing Before"]
    [:li {:data "Page Number" :className "ribbonIconwithText" :style {:backgroundImage "url('img/pageNumber.png')"}} "Spacing After"]
    [:li {:data "Break Page" :className "ribbonIconwithText" :style {:backgroundImage "url('img/symbols.png')"}} "Line Height"]
    [:li {:data "Break Page" :className "ribbonIconwithText" :style {:backgroundImage "url('img/emoji.png')"}} "Paragraph Options"]]])

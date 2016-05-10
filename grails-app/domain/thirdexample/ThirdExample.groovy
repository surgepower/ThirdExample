package thirdexample

import metafunctionality.ModuleInput

class ThirdExample extends ModuleInput {
    String word
    String answer
    static hasMany = [rhymingCandidates:String]
    List rhymingCandidates
}

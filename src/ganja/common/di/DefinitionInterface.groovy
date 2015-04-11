package ganja.common.di

interface DefinitionInterface {

    DefinitionInterface setArguments(def args)

    void setTags(List tags)

    void addTag(String tag, Object attributes)

    Boolean hasTag(String tag)

    void clearTags()

    void clearTag(String tag)

    def getTag(String tag)
}
package ganja.common.di

interface ContainerInterface {

    void setParameter(String key, def value)

    def getParameter(String key)

    DefinitionInterface register(String id, def classNameOrServiceId)

    def get(String id)

    Map findServiceIdsByTag(String tag)
}
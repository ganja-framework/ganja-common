package ganja.common.di

interface ContainerInterface {

    void setParameter(String key, String value)

    String getParameter(String key)

    DefinitionInterface register(String id, def classNameOrServiceId)

    def get(String id)

    Map findServiceIdsByTag(String tag)
}
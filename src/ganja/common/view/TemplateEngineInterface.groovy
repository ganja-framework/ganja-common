package ganja.common.view

import ganja.common.http.ResponseInterface

interface TemplateEngineInterface {

    ResponseInterface render(String template, def data, ResponseInterface response)
    ResponseInterface render(String template, def data)
}
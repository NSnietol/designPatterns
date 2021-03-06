/**
 *
 * MIT License
 *
 * Copyright (c) 2018 Nilson Nieto López
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * */
package designPatterns.patterns.Structural.Adapter.Example1;

/**
 *
 * @author ns
 */
public class Adaptador110a220 implements IEnchuefeEuropeo{

    private IEnchufeIngles enchufe;
    
    public Adaptador110a220(IEnchufeIngles ench){
    enchufe= ench;
    }
      
      
    public void encender(){
    
        System.out.println("Voltaje recibido : "+this.enchufe.Flujo110V()+" V "+
                "\nVoltaje entregado : "+this.Flujo220V());
    
    }
    
    @Override
    public int Flujo220V() {
        
        return enchufe.Flujo110V()+220 > 220 ? 220 :enchufe.Flujo110V()+220;
        
    }

    @Override
    public int getNumeroBornes() {
        return 2;
    }
    
}

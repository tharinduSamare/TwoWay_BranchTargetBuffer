// ADS I Class Project
// Pipelined RISC-V Core with Hazard Detetcion and Resolution
//
// Chair of Electronic Design Automation, RPTU in Kaiserslautern
// File created on 05/21/2024 by Andro Mazmishvili (@Andrew8846)

package makeverilog

import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

import btb_pkg._


object Verilog_Gen extends App {
  emitVerilog(new TwoWayBTB(NSETS = 8), Array("--target-dir", "generated-src"))
}
